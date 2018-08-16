//package Graphs;
//import java.util.*;
////import Hashmap.HashTable;
//
////import java.security.Key;
//
//
//public class Graph {
//    private class Vertex {
//
//        private String name;
//        HashMap<Vertex, Integer> nbrs;
//
//        Vertex(String name) {
//
//            this.name = name;
//            this.nbrs = new HashMap<>();
//
//        }
//
//        public boolean equals(Object other) {
//            Vertex vtx = (Vertex) other;
//            return vtx.name.equals(this.name);
//        }
//
//        public int hashcode(String name) {
//
//            return this.name.hashCode();
//        }
//
//        public String display() {
//            String str = "";
//            str += this.name + "=>";
//            Set<Vertex> nbrs = this.nbrs.keySet();
//            for (Vertex vtx : nbrs) {
//                str = str + vtx.name + "(" + this.nbrs.get(vtx) + ")";
//
//            }
//            return str;
//        }
//
//
//
//
//    }
//
//        public HashMap<String,Vertex> vtces;
//    public Graph(){
//        vtces=new HashMap<>();
//    }
//
//        public int numVertices(){
//           return this.vtces.size();
//        }
//        public void addVertea(String name){
//            if(this.vtces.containsKey(name)) {
//                return;
//            }
//            Vertex vtx=new Vertex(name);
//
//            vtces.put(name,vtx);
//
//        }
//        public void remoceVertex(String name){
//        Vertex vtx=new Vertex(name);
//        if(!vtces.containsKey(vtx)){
//            return;
//            }
//        Set<Vertex> v=vtx.nbrs.keySet();
//        for(Vertex vt:v){
//            vt.nbrs.remove(vtx);
//        }
//        vtces.remove(name);
//
//        }
//
//        public int numEdges(){
//
//            int rt=0;
//
//            Collection<Vertex> vtx=this.vtces.values();
//            for(Vertex v:vtx){
//                rt+=v.nbrs.size();
//            }
//            return rt/2;
//        }
//        public void addEdges(String name1,String name2,int cost){
//
//        Vertex vtx1=vtces.get(name1);
//            Vertex vtx2=vtces.get(name2);
//
//        if(name1==null || name2==null|| vtx1.nbrs.containsKey(vtx2)){
//            return ;
//
//        }
//        vtx1.nbrs.put(vtx2,cost);
//            vtx2.nbrs.put(vtx1,cost);
//        }
//
//
//        public void removeEdge(String name1,String name2){
//
//
//            Vertex vtx1=new Vertex(name1);
//            Vertex vtx2=new Vertex(name2);
//
//            if(vtx1==null||vtx2==null||!vtx1.nbrs.containsKey(vtx2)){
//                return ;
//
//            }
//            vtx1.nbrs.remove(vtx2);
//            vtx2.nbrs.remove(vtx1);
//        }
//        public void display(){
//        Collection<Vertex> vt=vtces.values();
//      for(Vertex v:vt){
//          System.out.println( v.display());
//      }
//
//        }
//        //        public boolean hasPath(String name1,String name2){
//        //
//        //        Vertex vt1=vtces.get(name1);
//        //        Vertex vt2=vtces.get(name2);
//        //
//        //        if(vt1==null||vt2==null){
//        //            return false;
//        //        }
//        //       return  hasPath(vt1,vt2);
//        //
//        //
//        //
//        //        }
//        //        private boolean hasPath(Vertex vt1,Vertex vt2){
//        //        if(vt1.equals(vt2)){
//        //            return true;
//        //        }
//        //
//        //        Set<Vertex> v=vt1.nbrs.keySet();
//        //        for(Vertex v1:v){
//        //            hasPath(v1,vt2);
//        //        }
//        //        }
//        //
//
//            public void bfs(String name1,String name2 ) {
//                HashMap<Vertex,Boolean> explored=new HashMap<Vertex,Boolean>();
//
//
//                // Set<Vertex> neighbour=vt1.nbrs.keySet();
//
//
//
//
//
//        bfs(name1,name2,explored);  }
//
//    private void bfs(String name1, String name2, HashMap<Vertex,Boolean> explored) {
//
//        Vertex vt1 = vtces.get(name1);
//        Vertex vt2 = vtces.get(name2);
//
//        LinkedList<Vertex> queue = new LinkedList<>();
//            Collection<Vertex> vt=vtces.values();
//        for (Vertex vtx : vt) {
//
//            if (!explored.containsKey(vtx))
//                queue.add(vtx);
//
//            while (!queue.isEmpty()) {
//                Vertex rvtx = queue.remove(0);
//                if (!explored.containsKey(rvtx)) {
//                    explored.put(rvtx, true);
//                    System.out.print(rvtx.name + " ");
//                    Set<Vertex> nbrs = rvtx.nbrs.keySet();
//                    for (Vertex nbr : nbrs) {
//                        if (!explored.containsKey(nbr)) {
//                            queue.add(nbr);
//                        }
//                    }
//                }
//            }
//
//            // return false;
//        }
//    }
//
//    public void isConnected(){
//
//
//        HashMap<Vertex,Boolean> explored=new HashMap<>();
//
//
//        LinkedList<Vertex> queue = new LinkedList<>();
//        Collection<Vertex> vt=vtces.values();
//       queue.add()
//
//            if (!explored.containsKey(vtx))
//                queue.add(vtx);
//
//            while (!queue.isEmpty()) {
//                Vertex rvtx = queue.remove(0);
//                if (!explored.containsKey(rvtx)) {
//                    explored.put(rvtx, true);
//                    System.out.print(rvtx.name + " ");
//                    Set<Vertex> nbrs = rvtx.nbrs.keySet();
//                    for (Vertex nbr : nbrs) {
//                        if (!explored.containsKey(nbr)) {
//                            queue.add(nbr);
//                        }
//                    }
//                }
//            }
//
//            // return false;
//
//    }
//}
//
//
