package CH13_Basic_Hashing;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

//import static jdk.vm.ci.code.CodeUtil.K;

public class implementation_of_HashMap {
//     static void HashMap<K,V>{
//         private class Node{
//             K key;
//             V value;
//             public Node(K key,V value){
//                 this.key=key;
//                 this.value=value;
//             }
//         }
//         private int n;
//         private int N;
//         private LinkedList<Node> buckets[];
////         @SuppressWarnings("unchecked");
//        public HashMap(){
//            this.N=4;
//            this.buckets=new LinkedList[4];
//            for(int i=0;i<4;i++){
//                this.buckets[i]=new LinkedList<>();
//            }
//        }
//        private int hashFunction(K key){
//            int bi=key.hashCode();
//            return Math.abs(bi)%N;
//        }
//        private int searchInLL(K key ,int bi){
//            LinkedList<Node> LL=buckets[bi];
//            for(int i=0;i<LL.size();i++){
//                if(LL.get(i).key==key){
//                    return i;
//                }
//            }
//            return -1;
//
//        }
//        private void rehash(){
//            LinkedList<Node> oldbucket[]=buckets;
//            buckets=new LinkedList[N*2];
//            for(int i=0;i<N*2;i++){
//                buckets[i]=new LinkedList<>();
//            }
//            for(int i=0;i<oldbucket.length;i++){
//                LinkedList<Node> LL=oldbucket[i];
//                for(int j=0;j<LL.size();j++){
//                    Node node=LL.get(j);
//                    put(node.key,node.value);
//                }
//            }
//        }
//        public void put(K key,V value){
//            int bi=hashFunction(key);
//            int di= searchInLL(key,bi);
//            if (di==-1){
//                buckets[bi].add(new Node(key,value));
//                n++;
//            }
//            else{
//                Node node=buckets[bi].get(di);
//                node.value=value;
//            }
//            double lambda=(double) n/N;
//            if(lambda>2.0){
//                rehash();
//            }
//        }
//    }

    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("India",130);
        map.put("us",20);
        System.out.println(map);
    }
}
