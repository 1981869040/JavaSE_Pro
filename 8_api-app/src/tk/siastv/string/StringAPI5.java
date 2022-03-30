package tk.siastv.string;

// 目标：掌握String常用的其他API

public class StringAPI5 {
    public static void main(String[] args) {
        // 1、public int length(); 获取字符串的长度
        String name = "我是中国人";
        System.out.println(name.length());

        // 2、public char charAt(int index); 获取某个索引出的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("-----遍历字符串的每个字符-----");
        for (int i = 0; i < name.length(); i++) {
            char c1 = name.charAt(i);
            System.out.println(c1);
            System.out.println("----------------");
        }

        // 3、public char[] toCharArray(); 把字符串转换成字符数组
        char[] chars = name.toCharArray();
//        System.out.println(chars);
        for (int i = 0; i < name.length(); i++) {
            char ch = chars[i];
            System.out.println(ch);
        }

        // 4、public String substring(int beginIndex, int endIndex); 截取包前不包后
        String name2 = "Java是最厉害的编程语言";
        String substring = name2.substring(0, 9);
        System.out.println(substring);

        // 5、public String substring(int beginIndex); 从当前索引一直截取到末尾
        String substring1 = name2.substring(4);
        System.out.println(substring1);

        // 6、public String replace(CharSequence target ,CharSquence replacement); 屏蔽某些字符
        String name3 = "金三胖是屏蔽词，金三胖是打不出来的";
        String jsp = name3.replace("金三胖", "***");
        System.out.println(jsp);

        // 7、public boolean contains(CharSequence s); 判断是否包含某些字符
        boolean jsp2 = name3.contains("金三胖"); // true
        boolean jsp3 = name3.contains("金三胖1"); // false
        System.out.println(jsp2);
        System.out.println(jsp3);

        // 8、public boolean startsWiths(String prefix); 判断以什么开始
        boolean jsp4 = name3.startsWith("金三胖");
        boolean jsp5 = name3.startsWith("金三胖是");
        System.out.println(jsp4);
        System.out.println(jsp5);

        // 9、public String[] split(String s); 按照某个内容把字符串分割成字符串数组返回
        String name4 = "中国,美国,英国";
        String[] split = name4.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
