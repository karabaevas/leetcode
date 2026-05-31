class Point {
    int time;
    int value;

    public Point(int time, int value) {
        this.time = time;
        this.value = value;
    }
}

;

//sum_series(
// a={{1, 2}, {5, 1}},
// b={{2, 4}, {3, 6}, {9, 7}})
// ->
// {{1, 2}, {2, 6}, {3, 8}, {5, 7}, {9, 8}}
List<Point> sumSeries(List<Point> a, List<Point> b) {
    List<Point> res = new ArrayList<>();

    int i = 0;
    int j = 0;

    int aval = 0;
    int bval = 0;
    int time = 0;

    while(i < a.size() || j < b.size()){

        if(j == b.size() || a.get(i).time < b.get(j).time){
            aval = a.get(i).value;
            time = a.get(i).time;
            i++;
        } else if(b.get(j).time < a.get(i).time){
            bval = b.get(j).value;
            time = b.get(j).time;
            j++;
        } else {
            aval = a.get(i).value;
            bval = b.get(j).value;
            time = b.get(j).time;
            i++;
            j++;
        }

        int sum = aval + bval;

        if(res.isEmpty() || res.getLast().value != sum){
            res.add(new Point(time, sum));
        }
    }


    return res;
}