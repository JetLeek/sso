package top.leeklong;/**
 * Created by pc on 2017/6/16.
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * test
 *
 * @author lee
 * @create 2017-06-16 15:54
 **/
public class TestAPP {

    public static void main(String[] args) throws IOException {
        String ids="[\"123456\"]";

        ObjectMapper objectMapper = new ObjectMapper();
        List<String> list = objectMapper.readValue(ids,List.class);
        System.out.println(list);

    }
}
