package priv.zhenwen.project.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * @author zhenwen
 * @date 2021/7/31
 */

public interface FileService {

    /**
     * 上传文件
     *
     * @param file 文件
     * @return 文件访问url
     */
    String upload(MultipartFile file);

    /**
     * 下载文件
     *
     * @param url 文件路径
     * @param response 响应体
     */
    void download(String url, HttpServletResponse response);
}
