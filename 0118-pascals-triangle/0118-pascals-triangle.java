class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 1; i <= numRows; i++)
        {
            pascal.add(element(i));
        }
        return pascal;
    }
    private List<Integer> element(int row)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i < row; i++)
        {
            long num = list.get(i - 1) * (row - i) / i;
            list.add((int)num);
        }
        return list;
    }
}