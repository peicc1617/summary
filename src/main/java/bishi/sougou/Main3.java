package bishi.sougou;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 18:52:28
 **/
public class Main3 {
    #include<iostream>
#include<stdio.h>
#include<string.h>
#include<algorithm>
    using namespace std;
    int sum1[1000];
    int sum2[1000];
    int a[1000];
    int n,m;
    int lowbit(int x){
        return x&(-x);
    }
    void update(int x,int w){//更新效果：把x位置后面所有的数的值+w
        for (int i=x;i<=n;i+=lowbit(i)){
            sum1[i]+=w;//维护前缀和c[i]
            sum2[i]+=w*(x-1);//维护前缀和c[i]*(n-1)
        }
    }
    void range_update(int l,int r,int val)//更新效果：把l位置到r位置所有的数的值+w
    {
        update(l,val);
        update(r+1,-val);
    }
    int sum(int x){//求1-x的和
        int ans=0;
        for (int i=x;i>0;i-=lowbit(i)){
            ans+=x*sum1[i]-sum2[i];
        }
        return ans;
    }
    int range_ask(int l,int r){//求l-r的和
        return sum(r)-sum(l-1);
    }
    int main(){
        while(~scanf("%d%d",&n,&m)){
            for (int i=1;i<=n;i++){
                scanf("%d",&a[i]);
                update(i,a[i]-a[i-1]);//维护差分数组
            }
        }
        return 0;
    }
}
