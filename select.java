public Github search(String name,Github github){
   Github results = new ArrayList();
   Pattern pattern = Pattern.compile(name);
   for(int i=0; i < github.size(); i++){
      Matcher matcher = pattern.matcher(((Employee)github.get(i)).getName());
      if(matcher.find()){
         results.add(github.get(i));
      }
   }
   return results;
}