package com.yupi.aicodehelper.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassUtils {

    /**
     * 将Class转换为class文件保存到本地
     * @param clazz
     * @param outputPath
     * @throws IOException
     */
    public static boolean saveClassToFile(Class<?> clazz, String outputPath) {
        String className = clazz.getName();
        String classFileName = className.replace('.', '/') + ".class";

        try (InputStream inputStream = clazz.getClassLoader().getResourceAsStream(classFileName)) {
            if (inputStream != null) {
                Files.copy(inputStream, Paths.get(outputPath));
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
