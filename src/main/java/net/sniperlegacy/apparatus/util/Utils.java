package net.sniperlegacy.apparatus.util;

import net.sniperlegacy.apparatus.Document;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Mike on 2016-12-20.
 */
public class Utils {
    private static Logger m_logger;

    public static Logger getLogger() {
        if (m_logger == null) {
            m_logger = LogManager.getFormatterLogger(Document.MOD_ID);
        }
        return m_logger;
    }
}
