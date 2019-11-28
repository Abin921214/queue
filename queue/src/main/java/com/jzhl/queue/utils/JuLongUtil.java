package com.jzhl.queue.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class JuLongUtil {


    public static String[] code = new String[]{
            "其他",
            "失败",
            "提取特征值失败",
            "文件名字编号重复",
            "库满",
            "添加超时",
            "参数错误",
            "文件太大",
            "存储空间不足",
            "文件打开失败",
            "没有数据库",
            "图片读取失败",
            "数据库文件损坏",
            "图片质量差",
            "图片尺寸错误，宽高不能为奇数",
            "检测人脸失败（没检测到人脸或者检测到多人脸）",
            "图片格式错误",
            "人脸区域错误",
            "算法创建句柄错误",
            "设备忙"
    };

    /**
     * 获取巨龙人脸识别设备的sign
     * @param deviceUUID
     * @param timeStamp
     * @return
     */
    public static  String  getSign(String deviceUUID, long timeStamp){
        String pex = deviceUUID + ":" + "admin" + ":" + "admin123456" + timeStamp;

        return MD5Utils.getPwd(pex).toLowerCase();
    }


    /**
     * 获取黑白名单库列表
     * @param deviceUUID    设备UUID
     * @param mode          名单类别 1：黑名单  2：白名单 3：VIP名单
     * @return
     */
    public static JSONObject getList(String deviceUUID, String url, Integer mode){
        Date date=new Date();
        long timeStamp = DateUtils.toUnixTimeStamp(date.getTime());
        String sign = JuLongUtil.getSign(deviceUUID,timeStamp);

        JSONObject jsonObject = new JSONObject();
        JSONObject pic = new JSONObject();
        jsonObject.put("Name","WBListInfoREQ");
        jsonObject.put("UUID",deviceUUID);
        jsonObject.put("TimeStamp",timeStamp);
        jsonObject.put("Sign", sign);
        jsonObject.put("Mode", mode);
        jsonObject.put("Action","GetList ");

        try {
            String result = HttpClientUtil.doPostJson(url.replaceAll(" ", "").trim(),jsonObject.toString());
            JSONObject jsonResult = JSONObject.parseObject(result);
            return jsonResult;
        }catch (Exception e){
            return null;
        }
    }


    /**
     * 删除一张名单库图片
     * @param deviceUUID    设备UUID
     * @param mode          名单类别 1：黑名单  2：白名单 3：VIP名单
     * @param imgName       图片名(固定.jpg后缀)
     * @param libIndex      库索引
     * @param flieIndex     图片索引
     * @return
     */
    public static JSONObject delOnePic(String deviceUUID, String url, Integer mode, String imgName, Integer libIndex, Integer flieIndex){
        Date date=new Date();
        long timeStamp = DateUtils.toUnixTimeStamp(date.getTime());
        String sign = JuLongUtil.getSign(deviceUUID,timeStamp);

        JSONObject jsonObject = new JSONObject();
        JSONObject pic = new JSONObject();
        jsonObject.put("Name","WBListInfoREQ");
        jsonObject.put("UUID",deviceUUID);
        jsonObject.put("TimeStamp",timeStamp);
        jsonObject.put("Sign", sign);
        jsonObject.put("Mode", mode);
        jsonObject.put("Action","DeleteOnePic");

        // 添加图片信息
        pic.put("LibIndex", libIndex);
        pic.put("FlieIndex", flieIndex);
        pic.put("Pic", imgName);

        jsonObject.put("DeleteOnePic",pic);

        System.out.println(jsonObject);

        try {

            String result = HttpClientUtil.doPostJson(url.replaceAll(" ", "").trim(),jsonObject.toString());
            JSONObject jsonResult = JSONObject.parseObject(result);
            return jsonResult;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 添加一张名单库图片
     * @param deviceUUID  设备UUID
     * @param mode      名单类别  1：黑名单  2：白名单  3：VIP名单
     * @param imgName   图片命名 (自定义) 28字符
     * @param imgNum    图片编号 (自定义) 28字符
     * @param imgBase64 图片数据(base64编码)
     * @return
     */
    public static JSONObject addOnePic(String deviceUUID,String url, Integer mode, String imgName, String imgNum, String imgBase64){

        System.out.println("deviceUUID:" + deviceUUID);
        System.out.println("url:" + url.replaceAll(" ", "").trim());
        System.out.println("mode:" + mode);
        System.out.println("imgName:" + imgName);
        System.out.println("imgNum:" + imgNum);
//        System.out.println("imgBase64：" + imgBase64);

        Date date=new Date();
        long timeStamp = DateUtils.toUnixTimeStamp(date.getTime());
        String sign = JuLongUtil.getSign(deviceUUID,timeStamp);


        JSONObject jsonObject = new JSONObject();
        JSONObject pic = new JSONObject();
        jsonObject.put("Name","WBListInfoREQ");
        jsonObject.put("UUID",deviceUUID);
        jsonObject.put("TimeStamp",timeStamp);
        jsonObject.put("Sign", sign);
        jsonObject.put("Mode", mode);
        jsonObject.put("Action","AddOnePic");

        // 添加图片信息
        pic.put("ImgName", imgName);
        pic.put("ImgNum", imgNum);
        pic.put("Img", imgBase64);

        jsonObject.put("AddOnePic",pic);

        try {

            String result = HttpClientUtil.doPostJson(url.replaceAll(" ", "").trim(),jsonObject.toString());
            JSONObject jsonResult = JSONObject.parseObject(result);

            System.out.println(jsonResult);

            return jsonResult;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 获取人脸设备信息
     */
    public static void getDeviceInfo(String url){
        String deviceUUID  = "umet9hhrpyee";

        Date date=new Date();
        long timeStamp = DateUtils.toUnixTimeStamp(date.getTime());
        String sign = JuLongUtil.getSign(deviceUUID,timeStamp);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","DeviceInfoREQ");
        jsonObject.put("UUID",deviceUUID);
        jsonObject.put("TimeStamp",timeStamp);
        jsonObject.put("Sign", sign);

        System.out.println(HttpClientUtil.doPostJson(url,jsonObject.toString()));
    }


    public static void main(String[] args) {
        String deviceUUID  = "umet9hhrpyee";
        System.out.println(StringUtils.getStringToASCII(deviceUUID));
    }
}
