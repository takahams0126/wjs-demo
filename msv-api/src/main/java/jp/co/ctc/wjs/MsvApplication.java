package jp.co.ctc.wjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * WJSマイクロサービスアプリケーション.
 */

// CHECKSTYLE:OFF HideUtilityClassConstructor
@SpringBootApplication
public class MsvApplication {

    /**
     * @param args 引数
     */
    public static void main(final String[] args) {
        SpringApplication.run(MsvApplication.class, args);
    }

}
