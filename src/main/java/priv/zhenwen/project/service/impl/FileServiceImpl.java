package priv.zhenwen.project.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import priv.zhenwen.common.constant.Constants;
import priv.zhenwen.common.utils.StringUtils;
import priv.zhenwen.common.utils.file.FileUploadUtils;
import priv.zhenwen.common.utils.file.FileUtils;
import priv.zhenwen.config.properties.ApplicationProperties;
import priv.zhenwen.project.service.FileService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhenwen
 * @date 2021/7/31
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public String upload(MultipartFile file) {
        try {
            String filename = FileUploadUtils.upload(file);
            return Constants.DOMAIN_PREFIX + Constants.RESOURCE_PREFIX + "?url=" + filename;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void download(String url, HttpServletResponse response) {
        try {
            String localPath = ApplicationProperties.getProfile();
            String filename = StringUtils.substringAfterLast(url, "/");
            String downloadPath = localPath + url;
            response.setCharacterEncoding("utf-8");
            FileUtils.writeBytes(downloadPath, response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
