package com.example.functions.operations.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * @author : mohammad
 * @since : 10/15/2021 6:01 PM , Fri
 * functions
 **/
@Component("upload")
public class FileReceiver implements Consumer<MultipartFile>
{
    private final Logger logger = LoggerFactory.getLogger(FileReceiver.class);

    @Override
    public void accept(MultipartFile multipartFile)
    {
        try {
            String name = multipartFile.getName();
            long size = multipartFile.getSize();
            logger.info("file \"{}\" with size of ({}) bytes received",name,size);
            byte[] bytes = multipartFile.getBytes();
            logger.info(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
