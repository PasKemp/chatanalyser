package com.kemp.chatanalyser.utility;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

@Service
public class ResourceReaderService {

    public Optional<List<String>> readResource(final Resource resource) {
        List<String> list = new ArrayList<String>();
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            return Optional.of(list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
