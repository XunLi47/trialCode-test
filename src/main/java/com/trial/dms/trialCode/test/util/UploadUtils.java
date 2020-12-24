package com.trial.dms.trialCode.test.util;

import java.io.File;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * @author lx
 * @date 2020年12月24日
 */
public class UploadUtils {
	
	/**
     * 文件上传、返回新文件名
     *
     * @param file
     * @return
     */
    public static String upload(HttpServletRequest request, MultipartFile file) {
        String filePath = request.getServletContext().getRealPath("static" + File.separator + "resources" + File.separator + "images");
        File path = new File(filePath);
        if (!path.exists()) {
            path.mkdirs();
        }
        // 获取原始图片的扩展名
        String originalFilename = file.getOriginalFilename();
        // 生成文件新的名字
        String newFileName = UUID.randomUUID().toString().replace("-", "") + originalFilename;
        // 封装上传文件位置的全路径
        File targetFile = new File(filePath, newFileName);
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFileName;
    }

}
