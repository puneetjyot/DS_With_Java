package Trees;
public class clientst {
    public static void main(String[] args) {
        int arr[]={3,8,7,6,-2,-8,4,9};
        SegmentTree st=new SegmentTree(arr);
        st.display();

        System.out.println(st.query(2,6));
        st.update(4,0);
        System.out.println(st.query(2,6));


    }
}
