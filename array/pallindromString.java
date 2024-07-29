public class pallindromString {
    public boolean isPallindrom(String s1)
    {
        char[] ch=s1.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end)
        {
            if(ch[start]!=ch[end])
            return false;
            start++;
            end--;

        }
        return true;
    }
    public static void main(String[]args)
    {    
        pallindromString obj=new pallindromString();
        String s="rahul";
        boolean b1=obj. isPallindrom(s);
        System.out.println(b1);
    }
    
}
