class Solution
{
  public void deleteMid(Stack<Integer>s,int sizeOfStack)
    {
        Integer a = null;
        if(s.isEmpty())
            return;
        else
        {
            if(s.size() == Math.ceil((sizeOfStack + 1)/2))
                s.pop();
            else
            {
                a = s.pop();
                deleteMid(s, sizeOfStack);
            }
        }
        if(a != null)
            s.push(a);
    }
}
