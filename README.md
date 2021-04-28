  
# programmers_code
  
### 프로그래머스 문제 풀이 코드
  
  
- **레벨 단위**로 패키지 생성
- 이 프로젝트 내 클래스 이름은 **언더스코어 '_' 로 시작**하는 것으로 통일
- 대부분의 **설명은 코드 내 주석**으로 작성 했으며, **필요에 따라** 일부 별도의 설명을 추가
- **클래스명은 구글 번역기 사용**


- [**주석 이외의 추가 설명은 블로그**](http://xxxelppa.tistory.com)에 정리
- '**문제이름**'을 클릭하면 블로그 게시물로 이동
- '**클래스이름**'을 클릭하면 깃헙 저장소로 이동
- test.{FQCN} 위치에 '**입출력 예**' 에 해당하는 테스트 코드 작성


- 라이브러리
  - org.junit.jupiter:junit-jupiter:5.7.1
  - org.assertj:assertj-core:3.19.0
  - org.projectlombok:lombok:1.18.16

#### level 1
|번호|분류|문제이름|클래스이름|테스트코드|
|:---:|---|---|---|---|
|001|2019 카카오 개발자 겨울 인턴십|[크레인 인형뽑기 게임](https://xxxelppa.tistory.com/137)|[_crane_doll_draw_game](https://github.com/nimkoes/programmers_code/blob/master/src/com/tistory/xxxelppa/level1/_crane_doll_draw_game.java)|[_crane_doll_draw_game_test](https://github.com/nimkoes/programmers_code/blob/master/src/test/com/tistory/xxxelppa/level1/_crane_doll_draw_game_test.java)|
|002|해시|[완주하지 못한 선수](https://xxxelppa.tistory.com/139)|[_a_player_who_could_not_finish](https://github.com/nimkoes/programmers_code/blob/master/src/com/tistory/xxxelppa/level1/_a_player_who_could_not_finish.java)|[_a_player_who_could_not_finish_test](https://github.com/nimkoes/programmers_code/blob/master/src/test/com/tistory/xxxelppa/level1/_a_player_who_could_not_finish_test.java)|
|003|2021 KAKAO BLIND RECRUITMENT|신규 아이디 추천|_recommend_new_id|_recommend_new_id_test|
|004|완전탐색|모의고사|_practice_test|_practice_test_test|
|005|탐욕법(Greedy)|체육복|_gym_suit|_gym_suit_test|
|006|정렬|K번째수|_kth_number|_kth_number_test|
|007|연습문제|2016년|_2016|_2016_test|
|008|연습문제|가운데 글자 가져오기|_bring_in_the_middle_letter|_bring_in_the_middle_letter_test|
|009|연습문제|같은 숫자는 싫어|_i_hate_the_same_number|_i_hate_the_same_number_test|
|010|월간 코드 챌린지 시즌1|3진법 뒤집기|_invert_the_ternary_system|_invert_the_ternary_system_test|
|011|2021 Dev-Matching: 웹 백엔드 개발자(상반기)|로또의 최고 순위와 최저 순위|_lotto's_highest_and_lowest_rankings|_lotto's_highest_and_lowest_rankings_test|
|012|월간 코드 챌린지 시즌1|내적|_dot_product|_dot_product_test|
|013|Summer/Winter Coding(~2018)|소수 만들기|_making_prime_numbers|_making_prime_numbers_test|
|014|월간 코드 챌린지 시즌1|두 개 뽑아서 더하기|_pick_two_and_add|_pick_two_and_add_test|
|015|Summer/Winter Coding(~2018)|예산|_budget|_budget_test|
|016|월간 코드 챌린지 시즌2|음양 더하기|_adding_yin_and_yang|_adding_yin_and_yang_test|
|017|연습문제|나누어 떨어지는 숫자 배열|_an_array_of_dividing_numbers|_an_array_of_dividing_numbers_test|
|018|찾아라 프로그래밍 마에스터|폰켓몬|_ponketmon|_ponketmon_test|
|019|연습문제|두 정수 사이의 합|_the_sum_between_two_integers|_the_sum_between_two_integers_test|
|020|연습문제|문자열 내 마음대로 정렬하기|_arrange_your_own_strings|_arrange_your_own_strings_test|
|021|연습문제|문자열 내 p와 y의 개수|_the_number_of_p_and_y_in_the_string|_the_number_of_p_and_y_in_the_string_test|
|022|연습문제|문자열 내림차순으로 배치하기|_arrange_the_strings_in_descending_order|_arrange_the_strings_in_descending_order_test|
|023|연습문제|문자열 다루기 기본|_basics_of_handling_strings|_basics_of_handling_strings_test|
|024|연습문제|서울에서 김서방 찾기|_find_kim_seobang_in_seoul|_find_kim_seobang_in_seoul_test|
|025|연습문제|소수 찾기|_find_prime_numbers|_find_prime_numbers_test|
|026|연습문제|수박수박수박수박수박수?|_watermelon_watermelon_watermelon_watermelon_waterclap|_watermelon_watermelon_watermelon_watermelon_waterclap_test|
|027|연습문제|문자열을 정수로 바꾸기|_converting_a_string_to_an_integer|_converting_a_string_to_an_integer_test|
|028|연습문제|시저 암호|_caesar_password|_caesar_password_test|
|029|연습문제|약수의 합|_the_sum_of_the_factors|_the_sum_of_the_factors_test|
|030|연습문제|이상한 문자 만들기|_create_weird_characters|_create_weird_characters_test|
|031|연습문제|자릿수 더하기|_add_the_number_of_digits|_add_the_number_of_digits_test|
|032|연습문제|자연수 뒤집어 배열로 만들기|_turning_over_a_whole_number_into_an_array|_turning_over_a_whole_number_into_an_array_test|
|033|연습문제|정수 내림차순으로 배치하기|_place_them_in_descending_whole_number_order|_place_them_in_descending_whole_number_order_test|
|034|연습문제|정수 제곱근 판별|_integer_square_root_discrimination|_integer_square_root_discrimination_test|
|035|연습문제|제일 작은 수 제거하기|_remove_the_smallest_number|_remove_the_smallest_number_test|
|036|연습문제|짝수와 홀수|_even_and_odd|_even_and_odd_test|
|037|2020 카카오 인턴십|키패드 누르기|_press_the_keypad|_press_the_keypad_test|
|038|연습문제|최대공약수와 최소공배수|_greatest_common_divisor_and_least_common_multiple|_greatest_common_divisor_and_least_common_multiple_test|
|039|연습문제|콜라츠 추측|_guess_the_colatz|_guess_the_colatz_test|
|040|연습문제|평균 구하기|_find_the_average|_find_the_average_test|
|041|연습문제|하샤드 수|_hashad_sue|_hashad_sue_test|
|042|연습문제|핸드폰 번호 가리기|_hide_your_cell_phone_number|_hide_your_cell_phone_number_test|
|043|연습문제|행렬의 덧셈|_matrix_addition|_matrix_addition_test|
|044|연습문제|x만큼 간격이 있는 n개의 숫자|_n_numbers_spaced_by_x|_n_numbers_spaced_by_x_test|
|045|연습문제|직사각형 별찍기|_draw_a_rectangular_star|_draw_a_rectangular_star_test|
|046|2018 KAKAO BLIND RECRUITMENT|(1차) 비밀지도|_1st_secret_map|_1st_secret_map_test|
|047|2019 KAKAO BLIND RECRUITMENT|실패율|_failure_rate|_failure_rate_test|
|048|2018 KAKAO BLIND RECRUITMENT|(1차) 다트 게임|_1st_darts_game|_1st_darts_game_test|


#### level 2

#### level 3


