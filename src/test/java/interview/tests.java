package interview;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * User: liubo
 * Datetime: 2017/4/2118:45
 */
public class tests {


    /**
     * @Description:
     * @param:
     * @return:
     * @author: liubo
     * @Date: 2017-04-21 18:57:15
     */
    @Test
    public void test() {
        List<Integer> storeIdList = new ArrayList<Integer>();
        String s = ",1180001,1180029,3100008,3220019,";
        String[] sl = s.split(",");
        for(String s2: sl){
            if(StringUtils.isNumeric(s2)){
                storeIdList.add(Integer.valueOf(s2));
            }
        }
        System.out.println(storeIdList);
    }


}
