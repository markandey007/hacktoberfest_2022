class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int sum=INT_MAX, d=INT_MAX;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++)
        {
            int b=i+1;
            int l=nums.size()-1;
            int s=0;
            while(l>b)
            {
                int s=nums[i]+nums[b]+nums[l];
                if(s>target)
                {
                    if(d>s-target)
                    {
                        d=s-target;
                        sum=s;
                    }
                    l--;
                }
                else if(s<target)
                {
                     if(d>target-s)
                    {
                        d=target-s;
                        sum=s;
                    }
                    b++; 
                }
                else
                    return s;
            }
        }
        return sum;
    }
};
