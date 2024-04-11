package 復習;

public class example {

    public static void main(String args[]){
        // 最高得点
        int chimpo = 0;

        // 配列の宣言と初期化
        int scores[] = {80, 92, 60 ,100, 78};

        // 配列の要素ごとに処理
        for(int i = 0; i<scores.length; i++){
            // 最高得点の保存
            if(scores[i] > chimpo) chimpo = scores[i];
        }

        System.out.println("max = " + chimpo);
    }

}
