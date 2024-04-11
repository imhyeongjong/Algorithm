# [level 0] 문자열 정렬하기 (1) - 120850 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120850) 

### 성능 요약

메모리: 72 MB, 시간: 0.56 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 12일 01:56:01

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어질 때, <code>my_string</code> 안에 있는 숫자만 골라 오름차순 정렬한 리스트를&nbsp;return 하도록 solution 함수를 작성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 100</li>
<li><code>my_string</code>에는 숫자가 한 개 이상 포함되어 있습니다.</li>
<li><code>my_string</code>은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
- - -</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"hi12392"</td>
<td>[1, 2, 2, 3, 9]</td>
</tr>
<tr>
<td>"p2o4i8gj2"</td>
<td>[2, 2, 4, 8]</td>
</tr>
<tr>
<td>"abcde0"</td>
<td>[0]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>"abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.</li>
</ul>

<p>설명명</p>
1. replaceAll를 사용해 "[^0-9]"인 0~9의 숫자가 아닌 문자열을 빈 문자열로 대체 한다.
2. 그 후 리스트에 다 넣은후 ""의 문자들을 split을 통해 분리해준다.
3. 그 후 정수형 리스트에 문자열 리스트의 길이를 넣어준다.
4. 그 후 for문을 이용해 길이를 잰후
5. answer에 my의 값들을 Integer.parseInt 형태로 바꿔준후 넣어준다.
6. 그리고 나서 정렬을 해준다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
