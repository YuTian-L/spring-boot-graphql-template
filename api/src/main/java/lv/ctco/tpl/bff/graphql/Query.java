package lv.ctco.tpl.bff.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import lv.ctco.tpl.bff.graphql.resolvers.JokeResolver;
import lv.ctco.tpl.bff.graphql.types.Joke;
import lv.ctco.tpl.bff.graphql.types.JokeCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLRootResolver {

    @Autowired
    private JokeResolver jokeResolver;

    public Joke joke(JokeCategory category) {
        return jokeResolver.getJoke(category);
    }
}
