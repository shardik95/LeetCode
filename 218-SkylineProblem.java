class BuildingPoint implements Comparable<BuildingPoint>{
             int x;
             int height;
             boolean isStart;
             
             public int compareTo(BuildingPoint o){
                 if(this.x!=o.x)
                     return this.x - o.x;
                 else
                     return (this.isStart? -this.height:this.height) - (o.isStart? -o.height:o.height);
             }
         }


class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        
        BuildingPoint[] BuildingPoints = new BuildingPoint[buildings.length*2];
        int index = 0;
        for(int[] building:buildings){
            BuildingPoints[index] = new BuildingPoint();
            BuildingPoints[index].x = building[0];
            BuildingPoints[index].isStart = true;
            BuildingPoints[index].height = building[2];
            
            BuildingPoints[index+1] = new BuildingPoint();
            BuildingPoints[index+1].x = building[1];
            BuildingPoints[index+1].isStart = false;
            BuildingPoints[index+1].height = building[2];
            
            index = index+2;
        }
        Arrays.sort(BuildingPoints);
        
        TreeMap<Integer,Integer> queue = new TreeMap<>();
        queue.put(0,1);
        int prevMaxHeight = 0;
        List<int[]> result = new ArrayList<>();
        
        for(BuildingPoint buildingpoint:BuildingPoints){
            
            if(buildingpoint.isStart){
                queue.compute(buildingpoint.height, (key,value)->{
                    if(value!=null)
                        return value+1;
                    return 1;
                });
            }
            else{
                queue.compute(buildingpoint.height, (key,value)->{
                    if(value==1)
                        return null;
                    return value-1;
                });
            }
            int maxheight = queue.lastKey();
            
            if(maxheight!=prevMaxHeight){
                result.add(new int[]{buildingpoint.x,maxheight});
                prevMaxHeight = maxheight;
            }
        }
        return result;
    }
}