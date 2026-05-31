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
    Point apprev = new Point(-1, 0);
    Point bpprev = new Point(-1, 0);

    while (i < a.size() && j < b.size()) {
        Point ap = a.get(i);
        Point bp = b.get(j);

        Point cur;
        if (ap.time < bp.time) {
            cur = new Point(ap.time, bpprev.value + ap.value);

            apprev = ap;
            i++;
        } else if (ap.time > bp.time) {
            cur = new Point(bp.time, apprev.value + bp.value);
            bpprev = bp;
            j++;
        } else {
            cur = new Point(ap.time, bp.value + ap.value);
            apprev = ap;
            bpprev = bp;
            i++;
            j++;
        }

        if(res.isEmpty() || (res.getLast().value != cur.value)){
            res.add(cur);
        }
    }

    while(i < a.size()){
        Point ap = a.get(i);
        Point cur = new Point(ap.time, bpprev.value + ap.value);
        apprev = ap;

        if(res.isEmpty() || (res.getLast().value != cur.value)){
            res.add(cur);
        }
        i++;
    }

    while(j < b.size()){
        Point bp = b.get(j);
        Point cur = new Point(bp.time, apprev.value + bp.value);
        bpprev = bp;

        if(res.isEmpty() || (res.getLast().value != cur.value)){
            res.add(cur);
        }
        j++;
    }


    return res;
}