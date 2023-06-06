//https://www.codingninjas.com/codestudio/problems/find-duplicate-in-array_8230816?challengeSlug=striver-sde-challenge

HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(arr.get(i))){
                return arr.get(i);
            }else{
                hs.add(arr.get(i));
            }
        }
        return 0;