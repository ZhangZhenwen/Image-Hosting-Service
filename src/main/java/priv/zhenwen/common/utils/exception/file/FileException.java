package priv.zhenwen.common.utils.exception.file;

import priv.zhenwen.common.utils.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author zhenwen
 * @date 2021/7/31
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
