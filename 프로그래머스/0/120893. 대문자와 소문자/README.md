# [level 0] 대문자와 소문자 - 120893 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120893) 

### 성능 요약

메모리: 72.8 MB, 시간: 4.50 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 16일 15:55:32

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li><code>my_string</code>은 영어 대문자와 소문자로만 구성되어 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"cccCCC"</td>
<td>"CCCccc"</td>
</tr>
<tr>
<td>"abCdEfghIJ"</td>
<td>"ABcDeFGHij"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.</li>
</ul>

설명
for문을 이용하기 위해 리스트를 지정해주고
length를 통해 길이를 결정한 다음
0번째부터 비교하는값을 toUpperCase() 혹은 toLowerCase()로 만들어서
비교해서 만약 대문자로 같다면 대문자를 넣어주고 소문자로 같다면
소문자로 넣어준다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
