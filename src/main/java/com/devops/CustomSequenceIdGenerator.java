package com.devops;

import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomSequenceIdGenerator implements IdentifierGenerator {

    private static final long serialVersionUID = 9044840431137912379L;
	private static final AtomicLong sequence = new AtomicLong(100000);

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
        return sequence.getAndIncrement();
	}

}
