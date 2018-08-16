//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//
//public class question {
//    public static void main(String[] args) throws IOException {
//        String path = "C:\\Users\\anmolnarang\\ws\\codeBlocksAssignment\\src\\codeBlocksAssignment\\file";
//        File[] listOffiles = listOfFiles(path);
//        FileReader fileReader;
//        String fileName = "";
//        HashMap<String, Integer> hmGlobal = new HashMap();
//        for (File file : listOffiles) {
//            HashMap<String, Integer> hmlocal = new HashMap();
//            if (file.isFile()) {
//                fileName = file.getName();
//
//                fileReader = new FileReader(path + "\\" + fileName);
//
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                String line = "";
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] lm = line.split(" ");
//                    for (int i = 0; i < lm.length; i++) {
//                        String temp = "";
//                        for (int j = 0; j < lm[i].length(); j++) {
//                            if ((lm[i].charAt(j) >= 'A' && lm[i].charAt(j) <= 'Z')
//                                    || (lm[i].charAt(j) >= 'a' && lm[i].charAt(j) <= 'z')) {
//                                temp += lm[i].substring(j, j + 1);
//                            }
//                            temp = temp.toLowerCase();
//                        }
//                        if (!hmlocal.containsKey(temp)) {
//                            hmlocal.put(temp, 1);
//                            if (hmGlobal.containsKey(temp)) {
//                                hmGlobal.put(temp, hmGlobal.get(temp) + 1);
//                            } else {
//                                hmGlobal.put(temp, 1);
//                            }
//                        }
//
//                    }
//
//                }
//            }
//        }
//        for (HashMap.Entry<String, Integer> entry : hmGlobal.entrySet()) {
//            if (entry.getValue() == listOffiles.length) {
//                System.out.println(entry.getKey());
//            }
//
//        }
//    }
//
//    public static File[] listOfFiles(String path) {
//
//        File folder = new File(path);
//        File[] listOfFiles = folder.listFiles();
//
//        return listOfFiles;
//
//    }
//}