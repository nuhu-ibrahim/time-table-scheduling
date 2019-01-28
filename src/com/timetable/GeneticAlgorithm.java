package com.timetable;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GeneticAlgorithm {
	
	private Data data;
	
	public GeneticAlgorithm(Data data)
	{
		this.data = data;
	}
	
	public Population evolve(Population population)
	{
		return mutatePopulation(crossoverPopulation(population));
	}
	
	Population crossoverPopulation(Population population)
	{
		Population crossoverPopulation = new Population(population.getSchedules().size(), data);
		IntStream.range(0, Driver.NUMB_OF_ELITE_SCHEDULES).forEach(x -> crossoverPopulation.getSchedules().set(x, population.getSchedules().get(x)));
		
		IntStream.range(Driver.NUMB_OF_ELITE_SCHEDULES, population.getSchedules().size()).forEach(x -> {
			if (Driver.CROSSOVER_RATE > Math.random())
			{
				Schedule schedule1 = selectTournamentPopulation(population).sortByFitness().getSchedules().get(0);
				Schedule schedule2 = selectTournamentPopulation(population).sortByFitness().getSchedules().get(0);
				crossoverPopulation.getSchedules().set(x, crossoverSchedule(schedule1, schedule2));
			}else crossoverPopulation.getSchedules().set(x, population.getSchedules().get(x));
		});
		
		return crossoverPopulation;
	}
	
	Schedule crossoverSchedule(Schedule schedule1, Schedule schedule2)
	{
		Schedule crossoverSchedule = new Schedule(data).initialize();
		
		IntStream.range(0, crossoverSchedule.getClasses().size()).forEach(x -> {
			if (Math.random() > 0.5) crossoverSchedule.getClasses().set(x, schedule1.getClasses().get(x));
			else crossoverSchedule.getClasses().set(x, schedule2.getClasses().get(x));
		});
		
		return crossoverSchedule;
	}
	
	Population mutatePopulation(Population population)
	{
		Population mutatePopulation = new Population(population.getSchedules().size(), data);
		
		ArrayList<Schedule> schedules = mutatePopulation.getSchedules();
		
		IntStream.range(0, Driver.NUMB_OF_ELITE_SCHEDULES).forEach(x -> schedules.set(x, population.getSchedules().get(x)));;
		
		IntStream.range(Driver.NUMB_OF_ELITE_SCHEDULES, population.getSchedules().size()).forEach(x -> {
			schedules.set(x, mutateSchedule(population.getSchedules().get(x)));
		});
		
		return mutatePopulation;
	}
	
	Schedule mutateSchedule(Schedule mutateSchedule)
	{
		Schedule schedule = new Schedule(data).initialize();
		
		IntStream.range(0, mutateSchedule.getClasses().size()).forEach(x -> {
			if (Driver.MUTATION_RATE > Math.random()) mutateSchedule.getClasses().set(x, schedule.getClasses().get(x));
		});
		
		return mutateSchedule;
	}
	
	Population selectTournamentPopulation(Population population)
	{
		Population tournamentPopulation = new Population(Driver.TOURNAMENT_SELECTION_SIZE, data);
		
		IntStream.range(0, Driver.TOURNAMENT_SELECTION_SIZE).forEach(x -> {
			tournamentPopulation.getSchedules().set(x, population.getSchedules().get((int) (Math.random() * population.getSchedules().size())));
		});
		
		return tournamentPopulation;
	}

}
