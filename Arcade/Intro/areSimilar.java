public boolean areSimilar(int[] a, int[] b) {   
    ArrayList<Integer> pairs = new ArrayList<>();
    for(int i = 0; i < a.length && pairs.size() <= 4; i++){
        if(a[i] != b[i]){
            pairs.add(a[i]); 
            pairs.add(b[i]);
        }        
    }
    return pairs.size() == 0 || (pairs.size() == 4 && check(pairs));
}

private boolean check(ArrayList<Integer> list){
    return list.get(0).equals(list.get(3)) && list.get(1).equals(list.get(2));
}
