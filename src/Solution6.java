import java.io.*;
import java.util.*;

    class ResultAt{

        public static int simpleArraySum(List<Integer> ar) {
            int sum = 0;
            for (int num : ar) {
                sum = sum + num;
            }
            return sum;
        }

        public static List<Integer> gradingStudents(List<Integer> grades) {
            List<Integer> result = new ArrayList<>();

            for(int grade : grades){
                if(grade < 38){
                    result.add(grade);

                }
                else{
                    int nextMultiple  = ((grade / 5) + 1) * 5;
                    if(nextMultiple - grade < 3){
                        result.add(nextMultiple);

                    }
                    else{
                        result.add(grade);
                    }
                }
            }
            return result;
        }
    }

    public class Solution6  {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> ar = new ArrayList<>();

            for (int i = 0; i < arCount; i++) {
                int arItem = Integer.parseInt(arTemp[i]);
                ar.add(arItem);
            }

            int result = ResultAt.simpleArraySum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }




