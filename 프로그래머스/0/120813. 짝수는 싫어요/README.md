# [level 0] 짝수는 싫어요 - 120813 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120813) 

### 성능 요약

메모리: 70.8 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 06일 18:23:00

### 문제 설명

<p>정수 <code>n</code>이 매개변수로 주어질 때, <code>n</code> 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>n</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>10</td>
<td>[1, 3, 5, 7, 9]</td>
</tr>
<tr>
<td>15</td>
<td>[1, 3, 5, 7, 9, 11, 13, 15]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 #1</p>

<ul>
<li>10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.</li>
</ul>

<p>입출력 #1</p>

<ul>
<li>15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.</li>
</ul>

![](https://velog.velcdn.com/images/ap3878/post/e5427bb1-40f4-4fcf-855d-a844799d05b2/image.png)

설명1 : 빈 리스트를 만들어 준후 n의 개수에 따라 나눠서 넣어야 하니 나눠준후
만약 n이 홀수라면 +1를 넣어준다. 그후 개수 길이를 선정후 홀수만 넣어줘야 하니
*2+1를 설정해준다.


![](https://velog.velcdn.com/images/ap3878/post/452c64d2-834b-4a90-8160-3c13f0c10cae/image.png)

설명2 : 사실 처음엔 이렇게 하면 더 간단하고 좋으니 이렇게 해볼려고 했으나
애초에 문제가 ArrayList가 아닌 int[]라서 **설명1**를 한것이다.
**설명2**처럼 하게 된다면 일단 문제 자체를 바꿔야 하는데 int[] 대신 ArrayList를
선정 한 후에 int는 못넣어주니 Integer로 선정후 넣어준다. 그리고 한번에 설정 하기위해
**import java.util.*;** 를 넣어서 간단하게 설정해주고
ArrayList를 만들었기 때문에 **add를 설정 해줄수 있게되므로** 더 간단히 만들수 있게된다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
