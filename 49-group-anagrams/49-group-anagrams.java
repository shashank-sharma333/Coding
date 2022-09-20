class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list= new ArrayList<List<String>>();
        Map<String, List<String>> wordMap= new HashMap<String, List<String>>();
        
        for(String s:strs)
        {
          char[] st= s.toCharArray();
          Arrays.sort(st);
          String key= String.valueOf(st);
          if(!wordMap.containsKey(key))
          {
              wordMap.put(key, new ArrayList<>());
          }
            
            wordMap.get(key).add(s);
        }
        
        return new ArrayList(wordMap.values());
    }
}