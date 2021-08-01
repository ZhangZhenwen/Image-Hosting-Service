package priv.zhenwen.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import priv.zhenwen.project.service.FileService;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zhenwen
 * @date 2021/7/31
 */
@RestController
public class CommonController {

    private static final Logger log = LoggerFactory.getLogger(CommonController.class);

    private final FileService fileService;

    @Autowired
    public CommonController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("upload")
    public String upload(MultipartFile file) {
        return fileService.upload(file);
    }

    @RequestMapping("download")
    public void download(String url, HttpServletResponse response) {
        fileService.download(url, response);
    }
}
