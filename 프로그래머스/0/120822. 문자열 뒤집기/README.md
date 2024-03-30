# [level 0] 문자열 뒤집기 - 120822 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120822) 

### 성능 요약

메모리: 74.7 MB, 시간: 0.08 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 30일 16:13:41

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어집니다. <code>my_string</code>을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>"jaron"</td>
<td>"noraj"</td>
</tr>
<tr>
<td>"bread"</td>
<td>"daerb"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>my_string</code>이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>my_string</code>이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.</li>
</ul>

1번째 설명 : 일단 먼저 빈리스트를 따로 생성 해준후 리스트에 몇개의 변수를
넣을지 먼저 생성해준다. 그 후 변수안에 길이들을 구해주기 위해
length를 통해 변수 하나하나 길이를 구해준후 그 값을 순서대로 answer의
리스트에 넣어준다.
![image](https://github.com/imhyeongjong/Algorithm/assets/85678935/68e2d5fb-fc4e-42d5-9652-ef0b325ccb5a)


2번째 설명 : 리스트의 형태가 없기 때문에 문자열의 위치를 바꿔줄수 없으니
간단하게 하기 위해서 charAt를 사용하여 문자열의 위치를 바꿔줄수 있다.
![image](https://github.com/imhyeongjong/Algorithm/assets/85678935/fe0c7617-e35a-4c62-a4ae-d49fbbd1a839)


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
