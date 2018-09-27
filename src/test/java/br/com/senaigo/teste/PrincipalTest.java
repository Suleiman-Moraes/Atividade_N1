package br.com.senaigo.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalTime;
import org.junit.Test;

import br.com.senaigo.exercicio02.Exercicio02;

public class PrincipalTest {

	@Test
	public void testGetHorario() {
		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		String time = d.format(new Date());
		LocalTime x = new LocalTime();
		x = x.parse(time);
		LocalTime y = Exercicio02.getHorario();
		assertEquals(x.getHourOfDay(), y.getHourOfDay());
		assertEquals(x.getMinuteOfHour(), y.getMinuteOfHour());
		assertEquals(x.getSecondOfMinute(), y.getSecondOfMinute());
		assertTrue(x.getMillisOfSecond() - y.getMillisOfSecond() < 100);
//		assertEquals(x.getHourOfDay(), y.getHourOfDay());
	}

}
