int makeArrayConsecutive2(int[] statues) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < statues.length; i++) 
        set.add(statues[i]);
    return set.last() - set.first() - set.size() + 1;
    
//     int count = 0; 
//     int prior = -1;
//     for (int statue : set) {
//         if (prior == -1) {
//             prior = statue;
//             continue;
//         } 
//         if (statue - prior > 1)
//             count += statue - prior - 1;
//         prior = statue;
//     }
//     return count;
}
