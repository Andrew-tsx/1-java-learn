/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-09 09:38
 * 项目名称: firstJava
 * 文件名称: test11_Logging
 */

import java.util.logging.Logger;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test11_Logging
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-09 09:38
 *
 */
public class test11_Logging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}
