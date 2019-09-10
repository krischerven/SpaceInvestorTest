package co.gc.space.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.Jupiter;
import co.gc.space.entity.planet.Mars;
import co.gc.space.entity.planet.Mercury;
import co.gc.space.entity.planet.Neptune;
import co.gc.space.entity.planet.Planet;
import co.gc.space.entity.planet.Saturn;
import co.gc.space.entity.planet.Uranus;
import co.gc.space.entity.planet.Venus;
import co.gc.space.repo.PlanetRepo;

@Controller
public class SpaceController {
	@Autowired
	PlanetRepo repo;
	final PlanetBuilder builder = new PlanetBuilder();
	
	@PostConstruct
	private void initialize() {
		builder.setRepo(repo);
	}
	
	private static ArrayList[] partition(List<Planet> planets) {
		ArrayList<Planet> _1 = new ArrayList<>();
		ArrayList<Planet> _2 = new ArrayList<>();
		ArrayList<Planet> _3 = new ArrayList<>();
		for (int i = 0; i < planets.size(); ++i) {
			if ((i % 3) == 0) {
				_3.add(planets.get(i));
			} else if ((i % 2) == 0) {
				_2.add(planets.get(i));
			} else {
				_1.add(planets.get(i));
			}
		}
		return new ArrayList[] {_3, _2, _1};
	}

	@RequestMapping("/")
	public ModelAndView home() {
		List<Planet> planets = new ArrayList<>();
		planets.add(new Jupiter());
		planets.add(new Mars());
		planets.add(new Mercury());
		planets.add(new Neptune());
		planets.add(new Saturn());
		planets.add(new Uranus());
		planets.add(new Venus());
		planets.add(builder.Build("47 uma b"));
		planets.add(builder.Build("kepler-421 b"));
		planets.add(builder.Build("beta pic b"));
		planets.add(builder.Build("beta pic c"));
		ArrayList[] planetArr = partition(planets);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("first", planetArr[0]);
		mv.addObject("second", planetArr[1]);
		mv.addObject("third", planetArr[2]);
		return mv;
	}


	@RequestMapping("/planets/jupiter")
	public ModelAndView jupiter() {
		return new ModelAndView("planets/jupiter", "planet", new Jupiter());
	}

	@RequestMapping("/planets/mars")
	public ModelAndView mars() {
		return new ModelAndView("planets/mars", "planet", new Mars());
	}

	@RequestMapping("/planets/mercury")
	public ModelAndView mercury() {
		return new ModelAndView("planets/mercury", "planet", new Mercury());
	}

	@RequestMapping("/planets/neptune")
	public ModelAndView neptune() {
		return new ModelAndView("planets/neptune", "planet", new Neptune());
	}

	@RequestMapping("/planets/saturn")
	public ModelAndView saturn() {
		return new ModelAndView("planets/saturn", "planet", new Saturn());
	}

	@RequestMapping("/planets/uranus")
	public ModelAndView uranus() {
		return new ModelAndView("planets/uranus", "planet", new Uranus());
	}

	@RequestMapping("/planets/venus")
	public ModelAndView venus() {
		return new ModelAndView("planets/venus", "planet", new Venus());
	}

	@RequestMapping("/planets/47_uma_b")
	public ModelAndView _47_uma_b() {
		return new ModelAndView("planets/47_uma_b", "planet", builder.Build("47 uma b"));
	}
	
	@RequestMapping("/planets/kepler-421_b")
	public ModelAndView _kepler_421_b() {
		return new ModelAndView("planets/kepler-421_b", "planet", builder.Build("kepler-421 b"));
	}
	
	@RequestMapping("/planets/beta_pictoris_b")
	public ModelAndView beta_pictoris_b() {
		return new ModelAndView("planets/beta_pictoris_b", "planet", builder.Build("beta pic b"));
	}
	
	@RequestMapping("/planets/beta_pictoris_c")
	public ModelAndView beta_pictoris_c() {
		return new ModelAndView("planets/beta_pictoris_c", "planet", builder.Build("beta pic c"));
	}
}