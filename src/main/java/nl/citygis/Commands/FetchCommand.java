package nl.citygis.Commands;

import nl.citygis.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by nav on 04-01-16.
 */
public class FetchCommand implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        log.info("Creating tables");

        jdbcTemplate.execute("CREATE TABLE `orders` (\n" +
                "  `order_id` int(11) unsigned NOT NULL AUTO_INCREMENT,\n" +
                "  `myshop_id` int(11) DEFAULT NULL,\n" +
                "  `myshop_order_id` varchar(255) DEFAULT NULL,\n" +
                "  `email` varchar(255) DEFAULT NULL,\n" +
                "  `name` varchar(255) DEFAULT NULL,\n" +
                "  `street` varchar(255) DEFAULT NULL,\n" +
                "  `streetnumber` varchar(255) DEFAULT NULL,\n" +
                "  `zip` varchar(255) DEFAULT NULL,\n" +
                "  `city` varchar(255) DEFAULT NULL,\n" +
                "  `status` varchar(255) DEFAULT NULL,\n" +
                "  `created_at` datetime DEFAULT NULL,\n" +
                "  `updated_at` datetime DEFAULT NULL,\n" +
                "  PRIMARY KEY (`order_id`)\n" +
                ") ENGINE=MyISAM AUTO_INCREMENT=1927 DEFAULT CHARSET=latin1");
        System.exit(0);
    }
}
