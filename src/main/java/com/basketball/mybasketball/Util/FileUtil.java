package com.basketball.mybasketball.Util;

import java.io.File;
import java.io.FileOutputStream;

/**
 * FileUtil 图片上传工具类
 * @author wangxian
 * @Description
 * @date 2019/4/23
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
