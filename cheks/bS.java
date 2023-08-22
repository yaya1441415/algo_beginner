public class bS{
  public static void main(String[] args){

  }

  public static void quickSort(int[] a, int l , int r){
    int partition;
    if (l<r) {
      p = partition(a, r);
      quickSort(a, l, p-1);
      quickSort(a, p+1, r);

    }

  }

  public static void partition(int[] a, int p){
    int i = -1;
    int j = 0 ;
    int n = a.size();

    for (int j ; j<n ; i++ ) {
      if (a[p]>=a[i]){
        swap(a, i++, j);
        i++
      }
      j++;
    }
    swap(a, i+1, p);
    return (i+1);
  }
  public static void swap(int[] a, int i, int j){
    int u = a[i];
    a[i] = a[j];
    a[j] = u;
  }
}
