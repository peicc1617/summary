package leetcode.number;

import java.util.Scanner;

/**
 * @基本功能:IP转换
 * @program:summary
 * @author:peicc
 * @create:2019-08-28 09:00:55
 **/
public class IPConversion {
    /**
     * @功能：ip地址转换成int(若想转换成二进制表示，直接调用toBinaryString()函数即可)
     * @Param: [ip]
     * @return: int
     * @Date: 2019/8/28
     */
    public static int ip2Int(String ip){
        String[] str=ip.split("\\.");
        int result=0;
        for (int i = 0; i <str.length ; i++) {
            result=result|(Integer.parseInt(str[i])<<8*i);
        }
        return result;
    }
    /**
     * @功能：ip地址转成int
     * @Param: [ipInt]
     * @return: java.lang.String
     * @Date: 2019/8/28
     */
    public static String int2Ip(int ipInt){
        String[] ipString=new String[4];
        for (int i = 0; i <4 ; i++) {
            int pos=i*8;
            int and=ipInt&(255<<pos);
            ipString[i]=String.valueOf(and>>>pos);

        }
        return String.join(".",ipString);
    }
    /**
     * @功能：主函数
     * @Param: [args]
     * @return: void
     * @Date: 2019/8/28
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            int result=ip2Int(str);
            System.out.println("ip地址"+str+"转成int为："+result+"二进制字符串表示为："+Long.toBinaryString(result)+"长度为："+Long.toBinaryString(result).length()+"转回整数为："+int2Ip(result));
        }


    }
//    方法2
    // 将127.0.0.1形式的IP地址转换成十进制整数，这里没有进行任何错误处理
    public static long ipToLong(String strIp) {
        long[] ip = new long[4];
        // 先找到IP地址字符串中.的位置
        int position1 = strIp.indexOf(".");
        int position2 = strIp.indexOf(".", position1 + 1);
        int position3 = strIp.indexOf(".", position2 + 1);
        // 将每个.之间的字符串转换成整型
        ip[0] = Long.parseLong(strIp.substring(0, position1));
        ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
        ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
        ip[3] = Long.parseLong(strIp.substring(position3 + 1));
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }

    // 将十进制整数形式转换成127.0.0.1形式的ip地址
    public static String longToIP(long longIp) {
        StringBuffer sb = new StringBuffer("");
        // 直接右移24位
        sb.append(String.valueOf((longIp >>> 24)));
        sb.append(".");
        // 将高8位置0，然后右移16位
        sb.append(String.valueOf((longIp & 0x00FFFFFF) >>> 16));
        sb.append(".");
        // 将高16位置0，然后右移8位
        sb.append(String.valueOf((longIp & 0x0000FFFF) >>> 8));
        sb.append(".");
        // 将高24位置0
        sb.append(String.valueOf((longIp & 0x000000FF)));
        return sb.toString();
    }
}
