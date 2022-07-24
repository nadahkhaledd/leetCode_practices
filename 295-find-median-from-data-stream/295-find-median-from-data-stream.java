
class MedianFinder {
    
    PriorityQueue<Integer> l;
    PriorityQueue<Integer> r;
    int totalCount = 0;

    public MedianFinder() {
        l = new PriorityQueue<>((a, b) -> b - a);
        r = new PriorityQueue<>();
    }
    
    void makeEqual()
    {
        while(l.size() -1 > r.size())
        {
            r.add(l.peek());
            l.poll();
        }
        
        while(r.size() > l.size())
        {
            l.add(r.peek());
            r.poll();
        }
    }
    
    
    public void addNum(int num) {
        if(totalCount == 0 || num <= l.peek())
            l.add(num);
        else
            r.add(num);
        makeEqual();
        totalCount+=1;
    }
    
    public double findMedian() {
        
        if(totalCount % 2 == 1)
            return l.peek();
        else
            return (l.peek() + r.peek()) / 2.0;
        
        
        }
        
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */