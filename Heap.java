//ヒープというかソート
package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	public static void main(String[] args) {
		List<Integer> heap = new ArrayList<Integer>();
		Integer result = 0;
		heap.add(1);
		heap.add(3);
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(7);
		//ここまでがで初期設定
		//ただ，ヒープってそんなに使うの？
		int heapSize = heap.size();
		int i = 0;
//		System.out.println(heapSize);
		for(i = 0; i < heapSize-1; i++) {
		if(heap.get(i) > heap.get(i+1)) {
			result = heap.get(i);
			heap.set(i, heap.get(i+1));
			heap.set(i+1, result);
			}
		}
		for(int heapResult : heap) {
			System.out.println(heapResult);
		}

	}

}
