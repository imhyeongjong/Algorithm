# [level 0] 배열 원소의 길이 - 120854 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120854) 

### 성능 요약

메모리: 76.8 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 30일 15:28:55

### 문제 설명

<p>문자열 배열 <code>strlist</code>가 매개변수로 주어집니다. <code>strlist</code> 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>strlist</code> 원소의 길이 ≤ 100</li>
<li><code>strlist</code>는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>strlist</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>["We", "are", "the", "world!"]</td>
<td>[2, 3, 3, 6]</td>
</tr>
<tr>
<td>["I", "Love", "Programmers."]</td>
<td>[1, 4, 12]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.</li>
</ul>

-----------------------------------------------------------------
설명 : 일단 먼저 빈리스트를 따로 생성 해준후 리스트에 몇개의 변수를
넣을지 먼저 생성해준다. 그 후 변수안에 길이들을 구해주기 위해
length를 통해 변수 하나하나 길이를 구해준후 그 값을 순서대로 answer의
리스트에 넣어준다.


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
