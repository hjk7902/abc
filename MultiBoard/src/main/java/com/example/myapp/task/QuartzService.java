package com.example.myapp.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class QuartzService implements IQuartzService {

	@Scheduled(cron="0/20 * * * * ?")
	public void doIt() {
		// 초, 분, 시, 일, 월, 요일(연도)
		// * 모든값, ? 해당항목 사용 안함, - 기간, 콤마(,) 값을 지정해 나열, / 시작과 반복 간격

		System.out.println(new Date());
	}

}
