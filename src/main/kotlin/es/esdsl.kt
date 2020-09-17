package es

import mbuhot.eskotlin.query.compound.bool
import mbuhot.eskotlin.query.term.range
import mbuhot.eskotlin.query.term.term
import org.elasticsearch.index.query.TermQueryBuilder

fun main() {
    val query:TermQueryBuilder = term {
            "user" to "Kimchy"
        }

    val query2 =
    bool{
        must {
            term { "user" to "kimchy" }
        }
        filter {
            term { "tag" to "tech" }
        }
        must_not {
            range {
                "age" {
                    from = 10
                    to = 20
                }
            }
        }
        should = listOf(
            term { "tag" to "wow" },
            term { "tag" to "elasticsearch" })
        minimum_should_match = 1
        boost = 1.0f
    }

    println(query2)
}