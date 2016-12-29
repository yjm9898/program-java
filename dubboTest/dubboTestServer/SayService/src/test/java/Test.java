import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/**
 * @author <a href="qiaotaosheng@wxchina.com">TaoSheng.Qiao</a>
 * @version 1.0.0
 * @description:
 * @date 2016-10-10 14:59
 */
public class Test {
    public static void main(String[] args) {
        String s = "e DFGDF df fdf gg    fdgf";
//        new Test().splite(s);
        new Test().ref();
    }


    private void splite(String s){
        String[] strArray = s.split("\\s+");
        for (String str : strArray){
            System.out.println(str);
        }
    }

    private void switchFun(String s){
        switch (s){
            case "E":
                System.out.println("good");
                break;
            case "w":
                System.out.println("yes");
                break;
            default:
                System.out.println("default");
        }
    }

    private void ref(){
        WeakHashMap weakHashMap = new WeakHashMap();

        List<WeakHashMap<byte[][], byte[][]>> maps = new ArrayList<WeakHashMap<byte[][], byte[][]>>();

        for (int i = 0; i < 1000; i++) {
            WeakHashMap<byte[][], byte[][]> d = new WeakHashMap<byte[][], byte[][]>();
            d.put(new byte[1000][1000], new byte[1000][1000]);
            maps.add(d);
            System.gc();
            System.err.println(i);
        }
    }
}
